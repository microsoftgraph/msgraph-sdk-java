package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements Parsable {
    /** Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault. */
    private AutomaticUpdateMode _automaticUpdateMode;
    /** Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease. */
    private WindowsUpdateType _businessReadyUpdatesOnly;
    /** Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode. */
    private WindowsDeliveryOptimizationMode _deliveryOptimizationMode;
    /** Exclude Windows update Drivers */
    private Boolean _driversExcluded;
    /** Defer Feature Updates by these many days */
    private Integer _featureUpdatesDeferralPeriodInDays;
    /** Pause Feature Updates */
    private Boolean _featureUpdatesPaused;
    /** Feature Updates Pause Expiry datetime */
    private OffsetDateTime _featureUpdatesPauseExpiryDateTime;
    /** Installation schedule */
    private WindowsUpdateInstallScheduleType _installationSchedule;
    /** Allow Microsoft Update Service */
    private Boolean _microsoftUpdateServiceAllowed;
    /** The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed. */
    private PrereleaseFeatures _prereleaseFeatures;
    /** Defer Quality Updates by these many days */
    private Integer _qualityUpdatesDeferralPeriodInDays;
    /** Pause Quality Updates */
    private Boolean _qualityUpdatesPaused;
    /** Quality Updates Pause Expiry datetime */
    private OffsetDateTime _qualityUpdatesPauseExpiryDateTime;
    /**
     * Instantiates a new WindowsUpdateForBusinessConfiguration and sets the default values.
     * @return a void
     */
    public WindowsUpdateForBusinessConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateForBusinessConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateForBusinessConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateForBusinessConfiguration();
    }
    /**
     * Gets the automaticUpdateMode property value. Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault.
     * @return a automaticUpdateMode
     */
    @javax.annotation.Nullable
    public AutomaticUpdateMode getAutomaticUpdateMode() {
        return this._automaticUpdateMode;
    }
    /**
     * Gets the businessReadyUpdatesOnly property value. Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     * @return a windowsUpdateType
     */
    @javax.annotation.Nullable
    public WindowsUpdateType getBusinessReadyUpdatesOnly() {
        return this._businessReadyUpdatesOnly;
    }
    /**
     * Gets the deliveryOptimizationMode property value. Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     * @return a windowsDeliveryOptimizationMode
     */
    @javax.annotation.Nullable
    public WindowsDeliveryOptimizationMode getDeliveryOptimizationMode() {
        return this._deliveryOptimizationMode;
    }
    /**
     * Gets the driversExcluded property value. Exclude Windows update Drivers
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDriversExcluded() {
        return this._driversExcluded;
    }
    /**
     * Gets the featureUpdatesDeferralPeriodInDays property value. Defer Feature Updates by these many days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFeatureUpdatesDeferralPeriodInDays() {
        return this._featureUpdatesDeferralPeriodInDays;
    }
    /**
     * Gets the featureUpdatesPaused property value. Pause Feature Updates
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFeatureUpdatesPaused() {
        return this._featureUpdatesPaused;
    }
    /**
     * Gets the featureUpdatesPauseExpiryDateTime property value. Feature Updates Pause Expiry datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFeatureUpdatesPauseExpiryDateTime() {
        return this._featureUpdatesPauseExpiryDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsUpdateForBusinessConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("automaticUpdateMode", (n) -> { currentObject.setAutomaticUpdateMode(n.getEnumValue(AutomaticUpdateMode.class)); });
            this.put("businessReadyUpdatesOnly", (n) -> { currentObject.setBusinessReadyUpdatesOnly(n.getEnumValue(WindowsUpdateType.class)); });
            this.put("deliveryOptimizationMode", (n) -> { currentObject.setDeliveryOptimizationMode(n.getEnumValue(WindowsDeliveryOptimizationMode.class)); });
            this.put("driversExcluded", (n) -> { currentObject.setDriversExcluded(n.getBooleanValue()); });
            this.put("featureUpdatesDeferralPeriodInDays", (n) -> { currentObject.setFeatureUpdatesDeferralPeriodInDays(n.getIntegerValue()); });
            this.put("featureUpdatesPaused", (n) -> { currentObject.setFeatureUpdatesPaused(n.getBooleanValue()); });
            this.put("featureUpdatesPauseExpiryDateTime", (n) -> { currentObject.setFeatureUpdatesPauseExpiryDateTime(n.getOffsetDateTimeValue()); });
            this.put("installationSchedule", (n) -> { currentObject.setInstallationSchedule(n.getObjectValue(WindowsUpdateInstallScheduleType::createFromDiscriminatorValue)); });
            this.put("microsoftUpdateServiceAllowed", (n) -> { currentObject.setMicrosoftUpdateServiceAllowed(n.getBooleanValue()); });
            this.put("prereleaseFeatures", (n) -> { currentObject.setPrereleaseFeatures(n.getEnumValue(PrereleaseFeatures.class)); });
            this.put("qualityUpdatesDeferralPeriodInDays", (n) -> { currentObject.setQualityUpdatesDeferralPeriodInDays(n.getIntegerValue()); });
            this.put("qualityUpdatesPaused", (n) -> { currentObject.setQualityUpdatesPaused(n.getBooleanValue()); });
            this.put("qualityUpdatesPauseExpiryDateTime", (n) -> { currentObject.setQualityUpdatesPauseExpiryDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the installationSchedule property value. Installation schedule
     * @return a windowsUpdateInstallScheduleType
     */
    @javax.annotation.Nullable
    public WindowsUpdateInstallScheduleType getInstallationSchedule() {
        return this._installationSchedule;
    }
    /**
     * Gets the microsoftUpdateServiceAllowed property value. Allow Microsoft Update Service
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftUpdateServiceAllowed() {
        return this._microsoftUpdateServiceAllowed;
    }
    /**
     * Gets the prereleaseFeatures property value. The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     * @return a prereleaseFeatures
     */
    @javax.annotation.Nullable
    public PrereleaseFeatures getPrereleaseFeatures() {
        return this._prereleaseFeatures;
    }
    /**
     * Gets the qualityUpdatesDeferralPeriodInDays property value. Defer Quality Updates by these many days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQualityUpdatesDeferralPeriodInDays() {
        return this._qualityUpdatesDeferralPeriodInDays;
    }
    /**
     * Gets the qualityUpdatesPaused property value. Pause Quality Updates
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQualityUpdatesPaused() {
        return this._qualityUpdatesPaused;
    }
    /**
     * Gets the qualityUpdatesPauseExpiryDateTime property value. Quality Updates Pause Expiry datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQualityUpdatesPauseExpiryDateTime() {
        return this._qualityUpdatesPauseExpiryDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("automaticUpdateMode", this.getAutomaticUpdateMode());
        writer.writeEnumValue("businessReadyUpdatesOnly", this.getBusinessReadyUpdatesOnly());
        writer.writeEnumValue("deliveryOptimizationMode", this.getDeliveryOptimizationMode());
        writer.writeBooleanValue("driversExcluded", this.getDriversExcluded());
        writer.writeIntegerValue("featureUpdatesDeferralPeriodInDays", this.getFeatureUpdatesDeferralPeriodInDays());
        writer.writeBooleanValue("featureUpdatesPaused", this.getFeatureUpdatesPaused());
        writer.writeOffsetDateTimeValue("featureUpdatesPauseExpiryDateTime", this.getFeatureUpdatesPauseExpiryDateTime());
        writer.writeObjectValue("installationSchedule", this.getInstallationSchedule());
        writer.writeBooleanValue("microsoftUpdateServiceAllowed", this.getMicrosoftUpdateServiceAllowed());
        writer.writeEnumValue("prereleaseFeatures", this.getPrereleaseFeatures());
        writer.writeIntegerValue("qualityUpdatesDeferralPeriodInDays", this.getQualityUpdatesDeferralPeriodInDays());
        writer.writeBooleanValue("qualityUpdatesPaused", this.getQualityUpdatesPaused());
        writer.writeOffsetDateTimeValue("qualityUpdatesPauseExpiryDateTime", this.getQualityUpdatesPauseExpiryDateTime());
    }
    /**
     * Sets the automaticUpdateMode property value. Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault.
     * @param value Value to set for the automaticUpdateMode property.
     * @return a void
     */
    public void setAutomaticUpdateMode(@javax.annotation.Nullable final AutomaticUpdateMode value) {
        this._automaticUpdateMode = value;
    }
    /**
     * Sets the businessReadyUpdatesOnly property value. Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     * @param value Value to set for the businessReadyUpdatesOnly property.
     * @return a void
     */
    public void setBusinessReadyUpdatesOnly(@javax.annotation.Nullable final WindowsUpdateType value) {
        this._businessReadyUpdatesOnly = value;
    }
    /**
     * Sets the deliveryOptimizationMode property value. Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     * @param value Value to set for the deliveryOptimizationMode property.
     * @return a void
     */
    public void setDeliveryOptimizationMode(@javax.annotation.Nullable final WindowsDeliveryOptimizationMode value) {
        this._deliveryOptimizationMode = value;
    }
    /**
     * Sets the driversExcluded property value. Exclude Windows update Drivers
     * @param value Value to set for the driversExcluded property.
     * @return a void
     */
    public void setDriversExcluded(@javax.annotation.Nullable final Boolean value) {
        this._driversExcluded = value;
    }
    /**
     * Sets the featureUpdatesDeferralPeriodInDays property value. Defer Feature Updates by these many days
     * @param value Value to set for the featureUpdatesDeferralPeriodInDays property.
     * @return a void
     */
    public void setFeatureUpdatesDeferralPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this._featureUpdatesDeferralPeriodInDays = value;
    }
    /**
     * Sets the featureUpdatesPaused property value. Pause Feature Updates
     * @param value Value to set for the featureUpdatesPaused property.
     * @return a void
     */
    public void setFeatureUpdatesPaused(@javax.annotation.Nullable final Boolean value) {
        this._featureUpdatesPaused = value;
    }
    /**
     * Sets the featureUpdatesPauseExpiryDateTime property value. Feature Updates Pause Expiry datetime
     * @param value Value to set for the featureUpdatesPauseExpiryDateTime property.
     * @return a void
     */
    public void setFeatureUpdatesPauseExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._featureUpdatesPauseExpiryDateTime = value;
    }
    /**
     * Sets the installationSchedule property value. Installation schedule
     * @param value Value to set for the installationSchedule property.
     * @return a void
     */
    public void setInstallationSchedule(@javax.annotation.Nullable final WindowsUpdateInstallScheduleType value) {
        this._installationSchedule = value;
    }
    /**
     * Sets the microsoftUpdateServiceAllowed property value. Allow Microsoft Update Service
     * @param value Value to set for the microsoftUpdateServiceAllowed property.
     * @return a void
     */
    public void setMicrosoftUpdateServiceAllowed(@javax.annotation.Nullable final Boolean value) {
        this._microsoftUpdateServiceAllowed = value;
    }
    /**
     * Sets the prereleaseFeatures property value. The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     * @param value Value to set for the prereleaseFeatures property.
     * @return a void
     */
    public void setPrereleaseFeatures(@javax.annotation.Nullable final PrereleaseFeatures value) {
        this._prereleaseFeatures = value;
    }
    /**
     * Sets the qualityUpdatesDeferralPeriodInDays property value. Defer Quality Updates by these many days
     * @param value Value to set for the qualityUpdatesDeferralPeriodInDays property.
     * @return a void
     */
    public void setQualityUpdatesDeferralPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this._qualityUpdatesDeferralPeriodInDays = value;
    }
    /**
     * Sets the qualityUpdatesPaused property value. Pause Quality Updates
     * @param value Value to set for the qualityUpdatesPaused property.
     * @return a void
     */
    public void setQualityUpdatesPaused(@javax.annotation.Nullable final Boolean value) {
        this._qualityUpdatesPaused = value;
    }
    /**
     * Sets the qualityUpdatesPauseExpiryDateTime property value. Quality Updates Pause Expiry datetime
     * @param value Value to set for the qualityUpdatesPauseExpiryDateTime property.
     * @return a void
     */
    public void setQualityUpdatesPauseExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._qualityUpdatesPauseExpiryDateTime = value;
    }
}
