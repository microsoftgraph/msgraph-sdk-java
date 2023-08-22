package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Update for business configuration, allows you to specify how and when Windows as a Service updates your Windows 10/11 devices with feature and quality updates. Supports ODATA clauses that DeviceConfiguration entity supports: $filter by types of DeviceConfiguration, $top, $select only DeviceConfiguration base properties, $orderby only DeviceConfiguration base properties, and $skip. The query parameter '$search' is not supported.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * When TRUE, allows eligible Windows 10 devices to upgrade to Windows 11. When FALSE, implies the device stays on the existing operating system. Returned by default. Query parameters are not supported.
     */
    private Boolean allowWindows11Upgrade;
    /**
     * Possible values for automatic update mode.
     */
    private AutomaticUpdateMode automaticUpdateMode;
    /**
     * Auto restart required notification dismissal method
     */
    private AutoRestartNotificationDismissalMethod autoRestartNotificationDismissal;
    /**
     * Which branch devices will receive their updates from
     */
    private WindowsUpdateType businessReadyUpdatesOnly;
    /**
     * Number of days before feature updates are installed automatically with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     */
    private Integer deadlineForFeatureUpdatesInDays;
    /**
     * Number of days before quality updates are installed automatically with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     */
    private Integer deadlineForQualityUpdatesInDays;
    /**
     * Number of days after deadline until restarts occur automatically with valid range from 0 to 7 days. Returned by default. Query parameters are not supported.
     */
    private Integer deadlineGracePeriodInDays;
    /**
     * Delivery optimization mode for peer distribution
     */
    private WindowsDeliveryOptimizationMode deliveryOptimizationMode;
    /**
     * When TRUE, excludes Windows update Drivers. When FALSE, does not exclude Windows update Drivers. Returned by default. Query parameters are not supported.
     */
    private Boolean driversExcluded;
    /**
     * Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days. Returned by default. Query parameters are not supported.
     */
    private Integer engagedRestartDeadlineInDays;
    /**
     * Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days. Returned by default. Query parameters are not supported.
     */
    private Integer engagedRestartSnoozeScheduleInDays;
    /**
     * Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     */
    private Integer engagedRestartTransitionScheduleInDays;
    /**
     * Defer Feature Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     */
    private Integer featureUpdatesDeferralPeriodInDays;
    /**
     * When TRUE, assigned devices are paused from receiving feature updates for up to 35 days from the time you pause the ring. When FALSE, does not pause Feature Updates. Returned by default. Query parameters are not supported.s
     */
    private Boolean featureUpdatesPaused;
    /**
     * The Feature Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported.
     */
    private OffsetDateTime featureUpdatesPauseExpiryDateTime;
    /**
     * The Feature Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported. This property is read-only.
     */
    private LocalDate featureUpdatesPauseStartDate;
    /**
     * The Feature Updates Rollback Start datetime.This value is the time when the admin rolled back the Feature update for the ring.Returned by default.Query parameters are not supported.
     */
    private OffsetDateTime featureUpdatesRollbackStartDateTime;
    /**
     * The number of days after a Feature Update for which a rollback is valid with valid range from 2 to 60 days. Returned by default. Query parameters are not supported.
     */
    private Integer featureUpdatesRollbackWindowInDays;
    /**
     * When TRUE, rollback Feature Updates on the next device check in. When FALSE, do not rollback Feature Updates on the next device check in. Returned by default.Query parameters are not supported.
     */
    private Boolean featureUpdatesWillBeRolledBack;
    /**
     * The Installation Schedule. Possible values are: ActiveHoursStart, ActiveHoursEnd, ScheduledInstallDay, ScheduledInstallTime. Returned by default. Query parameters are not supported.
     */
    private WindowsUpdateInstallScheduleType installationSchedule;
    /**
     * When TRUE, allows Microsoft Update Service. When FALSE, does not allow Microsoft Update Service. Returned by default. Query parameters are not supported.
     */
    private Boolean microsoftUpdateServiceAllowed;
    /**
     * When TRUE the device should wait until deadline for rebooting outside of active hours. When FALSE the device should not wait until deadline for rebooting outside of active hours. Returned by default. Query parameters are not supported.
     */
    private Boolean postponeRebootUntilAfterDeadline;
    /**
     * Possible values for pre-release features.
     */
    private PrereleaseFeatures prereleaseFeatures;
    /**
     * Defer Quality Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     */
    private Integer qualityUpdatesDeferralPeriodInDays;
    /**
     * When TRUE, assigned devices are paused from receiving quality updates for up to 35 days from the time you pause the ring. When FALSE, does not pause Quality Updates. Returned by default. Query parameters are not supported.
     */
    private Boolean qualityUpdatesPaused;
    /**
     * The Quality Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported.
     */
    private OffsetDateTime qualityUpdatesPauseExpiryDateTime;
    /**
     * The Quality Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported. This property is read-only.
     */
    private LocalDate qualityUpdatesPauseStartDate;
    /**
     * The Quality Updates Rollback Start datetime. This value is the time when the admin rolled back the Quality update for the ring. Returned by default. Query parameters are not supported.
     */
    private OffsetDateTime qualityUpdatesRollbackStartDateTime;
    /**
     * When TRUE, rollback Quality Updates on the next device check in. When FALSE, do not rollback Quality Updates on the next device check in. Returned by default. Query parameters are not supported.
     */
    private Boolean qualityUpdatesWillBeRolledBack;
    /**
     * Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes). Returned by default. Query parameters are not supported.
     */
    private Integer scheduleImminentRestartWarningInMinutes;
    /**
     * Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours). Returned by default. Query parameters are not supported.
     */
    private Integer scheduleRestartWarningInHours;
    /**
     * When TRUE, skips all checks before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc. When FALSE, does not skip all checks before restart. Returned by default. Query parameters are not supported.
     */
    private Boolean skipChecksBeforeRestart;
    /**
     * Windows Update Notification Display Options
     */
    private WindowsUpdateNotificationDisplayOption updateNotificationLevel;
    /**
     * Schedule the update installation on the weeks of the month. Possible values are: UserDefined, FirstWeek, SecondWeek, ThirdWeek, FourthWeek, EveryWeek. Returned by default. Query parameters are not supported. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek, unknownFutureValue.
     */
    private WindowsUpdateForBusinessUpdateWeeks updateWeeks;
    /**
     * Possible values of a property
     */
    private Enablement userPauseAccess;
    /**
     * Possible values of a property
     */
    private Enablement userWindowsUpdateScanAccess;
    /**
     * Instantiates a new windowsUpdateForBusinessConfiguration and sets the default values.
     */
    public WindowsUpdateForBusinessConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdateForBusinessConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsUpdateForBusinessConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsUpdateForBusinessConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateForBusinessConfiguration();
    }
    /**
     * Gets the allowWindows11Upgrade property value. When TRUE, allows eligible Windows 10 devices to upgrade to Windows 11. When FALSE, implies the device stays on the existing operating system. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowWindows11Upgrade() {
        return this.allowWindows11Upgrade;
    }
    /**
     * Gets the automaticUpdateMode property value. Possible values for automatic update mode.
     * @return a automaticUpdateMode
     */
    @jakarta.annotation.Nullable
    public AutomaticUpdateMode getAutomaticUpdateMode() {
        return this.automaticUpdateMode;
    }
    /**
     * Gets the autoRestartNotificationDismissal property value. Auto restart required notification dismissal method
     * @return a autoRestartNotificationDismissalMethod
     */
    @jakarta.annotation.Nullable
    public AutoRestartNotificationDismissalMethod getAutoRestartNotificationDismissal() {
        return this.autoRestartNotificationDismissal;
    }
    /**
     * Gets the businessReadyUpdatesOnly property value. Which branch devices will receive their updates from
     * @return a windowsUpdateType
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateType getBusinessReadyUpdatesOnly() {
        return this.businessReadyUpdatesOnly;
    }
    /**
     * Gets the deadlineForFeatureUpdatesInDays property value. Number of days before feature updates are installed automatically with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeadlineForFeatureUpdatesInDays() {
        return this.deadlineForFeatureUpdatesInDays;
    }
    /**
     * Gets the deadlineForQualityUpdatesInDays property value. Number of days before quality updates are installed automatically with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeadlineForQualityUpdatesInDays() {
        return this.deadlineForQualityUpdatesInDays;
    }
    /**
     * Gets the deadlineGracePeriodInDays property value. Number of days after deadline until restarts occur automatically with valid range from 0 to 7 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeadlineGracePeriodInDays() {
        return this.deadlineGracePeriodInDays;
    }
    /**
     * Gets the deliveryOptimizationMode property value. Delivery optimization mode for peer distribution
     * @return a windowsDeliveryOptimizationMode
     */
    @jakarta.annotation.Nullable
    public WindowsDeliveryOptimizationMode getDeliveryOptimizationMode() {
        return this.deliveryOptimizationMode;
    }
    /**
     * Gets the driversExcluded property value. When TRUE, excludes Windows update Drivers. When FALSE, does not exclude Windows update Drivers. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDriversExcluded() {
        return this.driversExcluded;
    }
    /**
     * Gets the engagedRestartDeadlineInDays property value. Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEngagedRestartDeadlineInDays() {
        return this.engagedRestartDeadlineInDays;
    }
    /**
     * Gets the engagedRestartSnoozeScheduleInDays property value. Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEngagedRestartSnoozeScheduleInDays() {
        return this.engagedRestartSnoozeScheduleInDays;
    }
    /**
     * Gets the engagedRestartTransitionScheduleInDays property value. Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEngagedRestartTransitionScheduleInDays() {
        return this.engagedRestartTransitionScheduleInDays;
    }
    /**
     * Gets the featureUpdatesDeferralPeriodInDays property value. Defer Feature Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFeatureUpdatesDeferralPeriodInDays() {
        return this.featureUpdatesDeferralPeriodInDays;
    }
    /**
     * Gets the featureUpdatesPaused property value. When TRUE, assigned devices are paused from receiving feature updates for up to 35 days from the time you pause the ring. When FALSE, does not pause Feature Updates. Returned by default. Query parameters are not supported.s
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFeatureUpdatesPaused() {
        return this.featureUpdatesPaused;
    }
    /**
     * Gets the featureUpdatesPauseExpiryDateTime property value. The Feature Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFeatureUpdatesPauseExpiryDateTime() {
        return this.featureUpdatesPauseExpiryDateTime;
    }
    /**
     * Gets the featureUpdatesPauseStartDate property value. The Feature Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported. This property is read-only.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getFeatureUpdatesPauseStartDate() {
        return this.featureUpdatesPauseStartDate;
    }
    /**
     * Gets the featureUpdatesRollbackStartDateTime property value. The Feature Updates Rollback Start datetime.This value is the time when the admin rolled back the Feature update for the ring.Returned by default.Query parameters are not supported.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFeatureUpdatesRollbackStartDateTime() {
        return this.featureUpdatesRollbackStartDateTime;
    }
    /**
     * Gets the featureUpdatesRollbackWindowInDays property value. The number of days after a Feature Update for which a rollback is valid with valid range from 2 to 60 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFeatureUpdatesRollbackWindowInDays() {
        return this.featureUpdatesRollbackWindowInDays;
    }
    /**
     * Gets the featureUpdatesWillBeRolledBack property value. When TRUE, rollback Feature Updates on the next device check in. When FALSE, do not rollback Feature Updates on the next device check in. Returned by default.Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFeatureUpdatesWillBeRolledBack() {
        return this.featureUpdatesWillBeRolledBack;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowWindows11Upgrade", (n) -> { this.setAllowWindows11Upgrade(n.getBooleanValue()); });
        deserializerMap.put("automaticUpdateMode", (n) -> { this.setAutomaticUpdateMode(n.getEnumValue(AutomaticUpdateMode.class)); });
        deserializerMap.put("autoRestartNotificationDismissal", (n) -> { this.setAutoRestartNotificationDismissal(n.getEnumValue(AutoRestartNotificationDismissalMethod.class)); });
        deserializerMap.put("businessReadyUpdatesOnly", (n) -> { this.setBusinessReadyUpdatesOnly(n.getEnumValue(WindowsUpdateType.class)); });
        deserializerMap.put("deadlineForFeatureUpdatesInDays", (n) -> { this.setDeadlineForFeatureUpdatesInDays(n.getIntegerValue()); });
        deserializerMap.put("deadlineForQualityUpdatesInDays", (n) -> { this.setDeadlineForQualityUpdatesInDays(n.getIntegerValue()); });
        deserializerMap.put("deadlineGracePeriodInDays", (n) -> { this.setDeadlineGracePeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("deliveryOptimizationMode", (n) -> { this.setDeliveryOptimizationMode(n.getEnumValue(WindowsDeliveryOptimizationMode.class)); });
        deserializerMap.put("driversExcluded", (n) -> { this.setDriversExcluded(n.getBooleanValue()); });
        deserializerMap.put("engagedRestartDeadlineInDays", (n) -> { this.setEngagedRestartDeadlineInDays(n.getIntegerValue()); });
        deserializerMap.put("engagedRestartSnoozeScheduleInDays", (n) -> { this.setEngagedRestartSnoozeScheduleInDays(n.getIntegerValue()); });
        deserializerMap.put("engagedRestartTransitionScheduleInDays", (n) -> { this.setEngagedRestartTransitionScheduleInDays(n.getIntegerValue()); });
        deserializerMap.put("featureUpdatesDeferralPeriodInDays", (n) -> { this.setFeatureUpdatesDeferralPeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("featureUpdatesPaused", (n) -> { this.setFeatureUpdatesPaused(n.getBooleanValue()); });
        deserializerMap.put("featureUpdatesPauseExpiryDateTime", (n) -> { this.setFeatureUpdatesPauseExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("featureUpdatesPauseStartDate", (n) -> { this.setFeatureUpdatesPauseStartDate(n.getLocalDateValue()); });
        deserializerMap.put("featureUpdatesRollbackStartDateTime", (n) -> { this.setFeatureUpdatesRollbackStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("featureUpdatesRollbackWindowInDays", (n) -> { this.setFeatureUpdatesRollbackWindowInDays(n.getIntegerValue()); });
        deserializerMap.put("featureUpdatesWillBeRolledBack", (n) -> { this.setFeatureUpdatesWillBeRolledBack(n.getBooleanValue()); });
        deserializerMap.put("installationSchedule", (n) -> { this.setInstallationSchedule(n.getObjectValue(WindowsUpdateInstallScheduleType::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftUpdateServiceAllowed", (n) -> { this.setMicrosoftUpdateServiceAllowed(n.getBooleanValue()); });
        deserializerMap.put("postponeRebootUntilAfterDeadline", (n) -> { this.setPostponeRebootUntilAfterDeadline(n.getBooleanValue()); });
        deserializerMap.put("prereleaseFeatures", (n) -> { this.setPrereleaseFeatures(n.getEnumValue(PrereleaseFeatures.class)); });
        deserializerMap.put("qualityUpdatesDeferralPeriodInDays", (n) -> { this.setQualityUpdatesDeferralPeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("qualityUpdatesPaused", (n) -> { this.setQualityUpdatesPaused(n.getBooleanValue()); });
        deserializerMap.put("qualityUpdatesPauseExpiryDateTime", (n) -> { this.setQualityUpdatesPauseExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("qualityUpdatesPauseStartDate", (n) -> { this.setQualityUpdatesPauseStartDate(n.getLocalDateValue()); });
        deserializerMap.put("qualityUpdatesRollbackStartDateTime", (n) -> { this.setQualityUpdatesRollbackStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("qualityUpdatesWillBeRolledBack", (n) -> { this.setQualityUpdatesWillBeRolledBack(n.getBooleanValue()); });
        deserializerMap.put("scheduleImminentRestartWarningInMinutes", (n) -> { this.setScheduleImminentRestartWarningInMinutes(n.getIntegerValue()); });
        deserializerMap.put("scheduleRestartWarningInHours", (n) -> { this.setScheduleRestartWarningInHours(n.getIntegerValue()); });
        deserializerMap.put("skipChecksBeforeRestart", (n) -> { this.setSkipChecksBeforeRestart(n.getBooleanValue()); });
        deserializerMap.put("updateNotificationLevel", (n) -> { this.setUpdateNotificationLevel(n.getEnumValue(WindowsUpdateNotificationDisplayOption.class)); });
        deserializerMap.put("updateWeeks", (n) -> { this.setUpdateWeeks(n.getEnumValue(WindowsUpdateForBusinessUpdateWeeks.class)); });
        deserializerMap.put("userPauseAccess", (n) -> { this.setUserPauseAccess(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("userWindowsUpdateScanAccess", (n) -> { this.setUserWindowsUpdateScanAccess(n.getEnumValue(Enablement.class)); });
        return deserializerMap;
    }
    /**
     * Gets the installationSchedule property value. The Installation Schedule. Possible values are: ActiveHoursStart, ActiveHoursEnd, ScheduledInstallDay, ScheduledInstallTime. Returned by default. Query parameters are not supported.
     * @return a windowsUpdateInstallScheduleType
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateInstallScheduleType getInstallationSchedule() {
        return this.installationSchedule;
    }
    /**
     * Gets the microsoftUpdateServiceAllowed property value. When TRUE, allows Microsoft Update Service. When FALSE, does not allow Microsoft Update Service. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftUpdateServiceAllowed() {
        return this.microsoftUpdateServiceAllowed;
    }
    /**
     * Gets the postponeRebootUntilAfterDeadline property value. When TRUE the device should wait until deadline for rebooting outside of active hours. When FALSE the device should not wait until deadline for rebooting outside of active hours. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPostponeRebootUntilAfterDeadline() {
        return this.postponeRebootUntilAfterDeadline;
    }
    /**
     * Gets the prereleaseFeatures property value. Possible values for pre-release features.
     * @return a prereleaseFeatures
     */
    @jakarta.annotation.Nullable
    public PrereleaseFeatures getPrereleaseFeatures() {
        return this.prereleaseFeatures;
    }
    /**
     * Gets the qualityUpdatesDeferralPeriodInDays property value. Defer Quality Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getQualityUpdatesDeferralPeriodInDays() {
        return this.qualityUpdatesDeferralPeriodInDays;
    }
    /**
     * Gets the qualityUpdatesPaused property value. When TRUE, assigned devices are paused from receiving quality updates for up to 35 days from the time you pause the ring. When FALSE, does not pause Quality Updates. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getQualityUpdatesPaused() {
        return this.qualityUpdatesPaused;
    }
    /**
     * Gets the qualityUpdatesPauseExpiryDateTime property value. The Quality Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getQualityUpdatesPauseExpiryDateTime() {
        return this.qualityUpdatesPauseExpiryDateTime;
    }
    /**
     * Gets the qualityUpdatesPauseStartDate property value. The Quality Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported. This property is read-only.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getQualityUpdatesPauseStartDate() {
        return this.qualityUpdatesPauseStartDate;
    }
    /**
     * Gets the qualityUpdatesRollbackStartDateTime property value. The Quality Updates Rollback Start datetime. This value is the time when the admin rolled back the Quality update for the ring. Returned by default. Query parameters are not supported.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getQualityUpdatesRollbackStartDateTime() {
        return this.qualityUpdatesRollbackStartDateTime;
    }
    /**
     * Gets the qualityUpdatesWillBeRolledBack property value. When TRUE, rollback Quality Updates on the next device check in. When FALSE, do not rollback Quality Updates on the next device check in. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getQualityUpdatesWillBeRolledBack() {
        return this.qualityUpdatesWillBeRolledBack;
    }
    /**
     * Gets the scheduleImminentRestartWarningInMinutes property value. Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes). Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getScheduleImminentRestartWarningInMinutes() {
        return this.scheduleImminentRestartWarningInMinutes;
    }
    /**
     * Gets the scheduleRestartWarningInHours property value. Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours). Returned by default. Query parameters are not supported.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getScheduleRestartWarningInHours() {
        return this.scheduleRestartWarningInHours;
    }
    /**
     * Gets the skipChecksBeforeRestart property value. When TRUE, skips all checks before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc. When FALSE, does not skip all checks before restart. Returned by default. Query parameters are not supported.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipChecksBeforeRestart() {
        return this.skipChecksBeforeRestart;
    }
    /**
     * Gets the updateNotificationLevel property value. Windows Update Notification Display Options
     * @return a windowsUpdateNotificationDisplayOption
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateNotificationDisplayOption getUpdateNotificationLevel() {
        return this.updateNotificationLevel;
    }
    /**
     * Gets the updateWeeks property value. Schedule the update installation on the weeks of the month. Possible values are: UserDefined, FirstWeek, SecondWeek, ThirdWeek, FourthWeek, EveryWeek. Returned by default. Query parameters are not supported. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek, unknownFutureValue.
     * @return a windowsUpdateForBusinessUpdateWeeks
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateForBusinessUpdateWeeks getUpdateWeeks() {
        return this.updateWeeks;
    }
    /**
     * Gets the userPauseAccess property value. Possible values of a property
     * @return a enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getUserPauseAccess() {
        return this.userPauseAccess;
    }
    /**
     * Gets the userWindowsUpdateScanAccess property value. Possible values of a property
     * @return a enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getUserWindowsUpdateScanAccess() {
        return this.userWindowsUpdateScanAccess;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowWindows11Upgrade", this.getAllowWindows11Upgrade());
        writer.writeEnumValue("automaticUpdateMode", this.getAutomaticUpdateMode());
        writer.writeEnumValue("autoRestartNotificationDismissal", this.getAutoRestartNotificationDismissal());
        writer.writeEnumValue("businessReadyUpdatesOnly", this.getBusinessReadyUpdatesOnly());
        writer.writeIntegerValue("deadlineForFeatureUpdatesInDays", this.getDeadlineForFeatureUpdatesInDays());
        writer.writeIntegerValue("deadlineForQualityUpdatesInDays", this.getDeadlineForQualityUpdatesInDays());
        writer.writeIntegerValue("deadlineGracePeriodInDays", this.getDeadlineGracePeriodInDays());
        writer.writeEnumValue("deliveryOptimizationMode", this.getDeliveryOptimizationMode());
        writer.writeBooleanValue("driversExcluded", this.getDriversExcluded());
        writer.writeIntegerValue("engagedRestartDeadlineInDays", this.getEngagedRestartDeadlineInDays());
        writer.writeIntegerValue("engagedRestartSnoozeScheduleInDays", this.getEngagedRestartSnoozeScheduleInDays());
        writer.writeIntegerValue("engagedRestartTransitionScheduleInDays", this.getEngagedRestartTransitionScheduleInDays());
        writer.writeIntegerValue("featureUpdatesDeferralPeriodInDays", this.getFeatureUpdatesDeferralPeriodInDays());
        writer.writeBooleanValue("featureUpdatesPaused", this.getFeatureUpdatesPaused());
        writer.writeOffsetDateTimeValue("featureUpdatesPauseExpiryDateTime", this.getFeatureUpdatesPauseExpiryDateTime());
        writer.writeOffsetDateTimeValue("featureUpdatesRollbackStartDateTime", this.getFeatureUpdatesRollbackStartDateTime());
        writer.writeIntegerValue("featureUpdatesRollbackWindowInDays", this.getFeatureUpdatesRollbackWindowInDays());
        writer.writeBooleanValue("featureUpdatesWillBeRolledBack", this.getFeatureUpdatesWillBeRolledBack());
        writer.writeObjectValue("installationSchedule", this.getInstallationSchedule());
        writer.writeBooleanValue("microsoftUpdateServiceAllowed", this.getMicrosoftUpdateServiceAllowed());
        writer.writeBooleanValue("postponeRebootUntilAfterDeadline", this.getPostponeRebootUntilAfterDeadline());
        writer.writeEnumValue("prereleaseFeatures", this.getPrereleaseFeatures());
        writer.writeIntegerValue("qualityUpdatesDeferralPeriodInDays", this.getQualityUpdatesDeferralPeriodInDays());
        writer.writeBooleanValue("qualityUpdatesPaused", this.getQualityUpdatesPaused());
        writer.writeOffsetDateTimeValue("qualityUpdatesPauseExpiryDateTime", this.getQualityUpdatesPauseExpiryDateTime());
        writer.writeOffsetDateTimeValue("qualityUpdatesRollbackStartDateTime", this.getQualityUpdatesRollbackStartDateTime());
        writer.writeBooleanValue("qualityUpdatesWillBeRolledBack", this.getQualityUpdatesWillBeRolledBack());
        writer.writeIntegerValue("scheduleImminentRestartWarningInMinutes", this.getScheduleImminentRestartWarningInMinutes());
        writer.writeIntegerValue("scheduleRestartWarningInHours", this.getScheduleRestartWarningInHours());
        writer.writeBooleanValue("skipChecksBeforeRestart", this.getSkipChecksBeforeRestart());
        writer.writeEnumValue("updateNotificationLevel", this.getUpdateNotificationLevel());
        writer.writeEnumValue("updateWeeks", this.getUpdateWeeks());
        writer.writeEnumValue("userPauseAccess", this.getUserPauseAccess());
        writer.writeEnumValue("userWindowsUpdateScanAccess", this.getUserWindowsUpdateScanAccess());
    }
    /**
     * Sets the allowWindows11Upgrade property value. When TRUE, allows eligible Windows 10 devices to upgrade to Windows 11. When FALSE, implies the device stays on the existing operating system. Returned by default. Query parameters are not supported.
     * @param value Value to set for the allowWindows11Upgrade property.
     */
    public void setAllowWindows11Upgrade(@jakarta.annotation.Nullable final Boolean value) {
        this.allowWindows11Upgrade = value;
    }
    /**
     * Sets the automaticUpdateMode property value. Possible values for automatic update mode.
     * @param value Value to set for the automaticUpdateMode property.
     */
    public void setAutomaticUpdateMode(@jakarta.annotation.Nullable final AutomaticUpdateMode value) {
        this.automaticUpdateMode = value;
    }
    /**
     * Sets the autoRestartNotificationDismissal property value. Auto restart required notification dismissal method
     * @param value Value to set for the autoRestartNotificationDismissal property.
     */
    public void setAutoRestartNotificationDismissal(@jakarta.annotation.Nullable final AutoRestartNotificationDismissalMethod value) {
        this.autoRestartNotificationDismissal = value;
    }
    /**
     * Sets the businessReadyUpdatesOnly property value. Which branch devices will receive their updates from
     * @param value Value to set for the businessReadyUpdatesOnly property.
     */
    public void setBusinessReadyUpdatesOnly(@jakarta.annotation.Nullable final WindowsUpdateType value) {
        this.businessReadyUpdatesOnly = value;
    }
    /**
     * Sets the deadlineForFeatureUpdatesInDays property value. Number of days before feature updates are installed automatically with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the deadlineForFeatureUpdatesInDays property.
     */
    public void setDeadlineForFeatureUpdatesInDays(@jakarta.annotation.Nullable final Integer value) {
        this.deadlineForFeatureUpdatesInDays = value;
    }
    /**
     * Sets the deadlineForQualityUpdatesInDays property value. Number of days before quality updates are installed automatically with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the deadlineForQualityUpdatesInDays property.
     */
    public void setDeadlineForQualityUpdatesInDays(@jakarta.annotation.Nullable final Integer value) {
        this.deadlineForQualityUpdatesInDays = value;
    }
    /**
     * Sets the deadlineGracePeriodInDays property value. Number of days after deadline until restarts occur automatically with valid range from 0 to 7 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the deadlineGracePeriodInDays property.
     */
    public void setDeadlineGracePeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.deadlineGracePeriodInDays = value;
    }
    /**
     * Sets the deliveryOptimizationMode property value. Delivery optimization mode for peer distribution
     * @param value Value to set for the deliveryOptimizationMode property.
     */
    public void setDeliveryOptimizationMode(@jakarta.annotation.Nullable final WindowsDeliveryOptimizationMode value) {
        this.deliveryOptimizationMode = value;
    }
    /**
     * Sets the driversExcluded property value. When TRUE, excludes Windows update Drivers. When FALSE, does not exclude Windows update Drivers. Returned by default. Query parameters are not supported.
     * @param value Value to set for the driversExcluded property.
     */
    public void setDriversExcluded(@jakarta.annotation.Nullable final Boolean value) {
        this.driversExcluded = value;
    }
    /**
     * Sets the engagedRestartDeadlineInDays property value. Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the engagedRestartDeadlineInDays property.
     */
    public void setEngagedRestartDeadlineInDays(@jakarta.annotation.Nullable final Integer value) {
        this.engagedRestartDeadlineInDays = value;
    }
    /**
     * Sets the engagedRestartSnoozeScheduleInDays property value. Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the engagedRestartSnoozeScheduleInDays property.
     */
    public void setEngagedRestartSnoozeScheduleInDays(@jakarta.annotation.Nullable final Integer value) {
        this.engagedRestartSnoozeScheduleInDays = value;
    }
    /**
     * Sets the engagedRestartTransitionScheduleInDays property value. Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the engagedRestartTransitionScheduleInDays property.
     */
    public void setEngagedRestartTransitionScheduleInDays(@jakarta.annotation.Nullable final Integer value) {
        this.engagedRestartTransitionScheduleInDays = value;
    }
    /**
     * Sets the featureUpdatesDeferralPeriodInDays property value. Defer Feature Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the featureUpdatesDeferralPeriodInDays property.
     */
    public void setFeatureUpdatesDeferralPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.featureUpdatesDeferralPeriodInDays = value;
    }
    /**
     * Sets the featureUpdatesPaused property value. When TRUE, assigned devices are paused from receiving feature updates for up to 35 days from the time you pause the ring. When FALSE, does not pause Feature Updates. Returned by default. Query parameters are not supported.s
     * @param value Value to set for the featureUpdatesPaused property.
     */
    public void setFeatureUpdatesPaused(@jakarta.annotation.Nullable final Boolean value) {
        this.featureUpdatesPaused = value;
    }
    /**
     * Sets the featureUpdatesPauseExpiryDateTime property value. The Feature Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported.
     * @param value Value to set for the featureUpdatesPauseExpiryDateTime property.
     */
    public void setFeatureUpdatesPauseExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.featureUpdatesPauseExpiryDateTime = value;
    }
    /**
     * Sets the featureUpdatesPauseStartDate property value. The Feature Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported. This property is read-only.
     * @param value Value to set for the featureUpdatesPauseStartDate property.
     */
    public void setFeatureUpdatesPauseStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.featureUpdatesPauseStartDate = value;
    }
    /**
     * Sets the featureUpdatesRollbackStartDateTime property value. The Feature Updates Rollback Start datetime.This value is the time when the admin rolled back the Feature update for the ring.Returned by default.Query parameters are not supported.
     * @param value Value to set for the featureUpdatesRollbackStartDateTime property.
     */
    public void setFeatureUpdatesRollbackStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.featureUpdatesRollbackStartDateTime = value;
    }
    /**
     * Sets the featureUpdatesRollbackWindowInDays property value. The number of days after a Feature Update for which a rollback is valid with valid range from 2 to 60 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the featureUpdatesRollbackWindowInDays property.
     */
    public void setFeatureUpdatesRollbackWindowInDays(@jakarta.annotation.Nullable final Integer value) {
        this.featureUpdatesRollbackWindowInDays = value;
    }
    /**
     * Sets the featureUpdatesWillBeRolledBack property value. When TRUE, rollback Feature Updates on the next device check in. When FALSE, do not rollback Feature Updates on the next device check in. Returned by default.Query parameters are not supported.
     * @param value Value to set for the featureUpdatesWillBeRolledBack property.
     */
    public void setFeatureUpdatesWillBeRolledBack(@jakarta.annotation.Nullable final Boolean value) {
        this.featureUpdatesWillBeRolledBack = value;
    }
    /**
     * Sets the installationSchedule property value. The Installation Schedule. Possible values are: ActiveHoursStart, ActiveHoursEnd, ScheduledInstallDay, ScheduledInstallTime. Returned by default. Query parameters are not supported.
     * @param value Value to set for the installationSchedule property.
     */
    public void setInstallationSchedule(@jakarta.annotation.Nullable final WindowsUpdateInstallScheduleType value) {
        this.installationSchedule = value;
    }
    /**
     * Sets the microsoftUpdateServiceAllowed property value. When TRUE, allows Microsoft Update Service. When FALSE, does not allow Microsoft Update Service. Returned by default. Query parameters are not supported.
     * @param value Value to set for the microsoftUpdateServiceAllowed property.
     */
    public void setMicrosoftUpdateServiceAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.microsoftUpdateServiceAllowed = value;
    }
    /**
     * Sets the postponeRebootUntilAfterDeadline property value. When TRUE the device should wait until deadline for rebooting outside of active hours. When FALSE the device should not wait until deadline for rebooting outside of active hours. Returned by default. Query parameters are not supported.
     * @param value Value to set for the postponeRebootUntilAfterDeadline property.
     */
    public void setPostponeRebootUntilAfterDeadline(@jakarta.annotation.Nullable final Boolean value) {
        this.postponeRebootUntilAfterDeadline = value;
    }
    /**
     * Sets the prereleaseFeatures property value. Possible values for pre-release features.
     * @param value Value to set for the prereleaseFeatures property.
     */
    public void setPrereleaseFeatures(@jakarta.annotation.Nullable final PrereleaseFeatures value) {
        this.prereleaseFeatures = value;
    }
    /**
     * Sets the qualityUpdatesDeferralPeriodInDays property value. Defer Quality Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are not supported.
     * @param value Value to set for the qualityUpdatesDeferralPeriodInDays property.
     */
    public void setQualityUpdatesDeferralPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.qualityUpdatesDeferralPeriodInDays = value;
    }
    /**
     * Sets the qualityUpdatesPaused property value. When TRUE, assigned devices are paused from receiving quality updates for up to 35 days from the time you pause the ring. When FALSE, does not pause Quality Updates. Returned by default. Query parameters are not supported.
     * @param value Value to set for the qualityUpdatesPaused property.
     */
    public void setQualityUpdatesPaused(@jakarta.annotation.Nullable final Boolean value) {
        this.qualityUpdatesPaused = value;
    }
    /**
     * Sets the qualityUpdatesPauseExpiryDateTime property value. The Quality Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported.
     * @param value Value to set for the qualityUpdatesPauseExpiryDateTime property.
     */
    public void setQualityUpdatesPauseExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.qualityUpdatesPauseExpiryDateTime = value;
    }
    /**
     * Sets the qualityUpdatesPauseStartDate property value. The Quality Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring. Returned by default. Query parameters are not supported. This property is read-only.
     * @param value Value to set for the qualityUpdatesPauseStartDate property.
     */
    public void setQualityUpdatesPauseStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.qualityUpdatesPauseStartDate = value;
    }
    /**
     * Sets the qualityUpdatesRollbackStartDateTime property value. The Quality Updates Rollback Start datetime. This value is the time when the admin rolled back the Quality update for the ring. Returned by default. Query parameters are not supported.
     * @param value Value to set for the qualityUpdatesRollbackStartDateTime property.
     */
    public void setQualityUpdatesRollbackStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.qualityUpdatesRollbackStartDateTime = value;
    }
    /**
     * Sets the qualityUpdatesWillBeRolledBack property value. When TRUE, rollback Quality Updates on the next device check in. When FALSE, do not rollback Quality Updates on the next device check in. Returned by default. Query parameters are not supported.
     * @param value Value to set for the qualityUpdatesWillBeRolledBack property.
     */
    public void setQualityUpdatesWillBeRolledBack(@jakarta.annotation.Nullable final Boolean value) {
        this.qualityUpdatesWillBeRolledBack = value;
    }
    /**
     * Sets the scheduleImminentRestartWarningInMinutes property value. Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes). Returned by default. Query parameters are not supported.
     * @param value Value to set for the scheduleImminentRestartWarningInMinutes property.
     */
    public void setScheduleImminentRestartWarningInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.scheduleImminentRestartWarningInMinutes = value;
    }
    /**
     * Sets the scheduleRestartWarningInHours property value. Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours). Returned by default. Query parameters are not supported.
     * @param value Value to set for the scheduleRestartWarningInHours property.
     */
    public void setScheduleRestartWarningInHours(@jakarta.annotation.Nullable final Integer value) {
        this.scheduleRestartWarningInHours = value;
    }
    /**
     * Sets the skipChecksBeforeRestart property value. When TRUE, skips all checks before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc. When FALSE, does not skip all checks before restart. Returned by default. Query parameters are not supported.
     * @param value Value to set for the skipChecksBeforeRestart property.
     */
    public void setSkipChecksBeforeRestart(@jakarta.annotation.Nullable final Boolean value) {
        this.skipChecksBeforeRestart = value;
    }
    /**
     * Sets the updateNotificationLevel property value. Windows Update Notification Display Options
     * @param value Value to set for the updateNotificationLevel property.
     */
    public void setUpdateNotificationLevel(@jakarta.annotation.Nullable final WindowsUpdateNotificationDisplayOption value) {
        this.updateNotificationLevel = value;
    }
    /**
     * Sets the updateWeeks property value. Schedule the update installation on the weeks of the month. Possible values are: UserDefined, FirstWeek, SecondWeek, ThirdWeek, FourthWeek, EveryWeek. Returned by default. Query parameters are not supported. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek, unknownFutureValue.
     * @param value Value to set for the updateWeeks property.
     */
    public void setUpdateWeeks(@jakarta.annotation.Nullable final WindowsUpdateForBusinessUpdateWeeks value) {
        this.updateWeeks = value;
    }
    /**
     * Sets the userPauseAccess property value. Possible values of a property
     * @param value Value to set for the userPauseAccess property.
     */
    public void setUserPauseAccess(@jakarta.annotation.Nullable final Enablement value) {
        this.userPauseAccess = value;
    }
    /**
     * Sets the userWindowsUpdateScanAccess property value. Possible values of a property
     * @param value Value to set for the userWindowsUpdateScanAccess property.
     */
    public void setUserWindowsUpdateScanAccess(@jakarta.annotation.Nullable final Enablement value) {
        this.userWindowsUpdateScanAccess = value;
    }
}
