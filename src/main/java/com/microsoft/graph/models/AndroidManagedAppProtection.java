package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> _apps;
    /** Friendly name of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. */
    private String _customBrowserDisplayName;
    /** Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. */
    private String _customBrowserPackageId;
    /** Count of apps to which the current policy is deployed. */
    private Integer _deployedAppCount;
    /** Navigation property to deployment summary of the configuration. */
    private ManagedAppPolicyDeploymentSummary _deploymentSummary;
    /** When this setting is enabled, app level encryption is disabled if device level encryption is enabled */
    private Boolean _disableAppEncryptionIfDeviceEncryptionIsEnabled;
    /** Indicates whether application data for managed apps should be encrypted */
    private Boolean _encryptAppData;
    /** Define the oldest required Android security patch level a user can have to gain secure access to the app. */
    private String _minimumRequiredPatchVersion;
    /** Define the oldest recommended Android security patch level a user can have for secure access to the app. */
    private String _minimumWarningPatchVersion;
    /** Indicates whether a managed user can take screen captures of managed apps */
    private Boolean _screenCaptureBlocked;
    /**
     * Instantiates a new AndroidManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static AndroidManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedAppProtection();
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a managedMobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this._apps;
    }
    /**
     * Gets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserDisplayName() {
        return this._customBrowserDisplayName;
    }
    /**
     * Gets the customBrowserPackageId property value. Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserPackageId() {
        return this._customBrowserPackageId;
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this._deployedAppCount;
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a managedAppPolicyDeploymentSummary
     */
    @javax.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this._deploymentSummary;
    }
    /**
     * Gets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAppEncryptionIfDeviceEncryptionIsEnabled() {
        return this._disableAppEncryptionIfDeviceEncryptionIsEnabled;
    }
    /**
     * Gets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEncryptAppData() {
        return this._encryptAppData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedAppProtection currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
            this.put("customBrowserDisplayName", (n) -> { currentObject.setCustomBrowserDisplayName(n.getStringValue()); });
            this.put("customBrowserPackageId", (n) -> { currentObject.setCustomBrowserPackageId(n.getStringValue()); });
            this.put("deployedAppCount", (n) -> { currentObject.setDeployedAppCount(n.getIntegerValue()); });
            this.put("deploymentSummary", (n) -> { currentObject.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
            this.put("disableAppEncryptionIfDeviceEncryptionIsEnabled", (n) -> { currentObject.setDisableAppEncryptionIfDeviceEncryptionIsEnabled(n.getBooleanValue()); });
            this.put("encryptAppData", (n) -> { currentObject.setEncryptAppData(n.getBooleanValue()); });
            this.put("minimumRequiredPatchVersion", (n) -> { currentObject.setMinimumRequiredPatchVersion(n.getStringValue()); });
            this.put("minimumWarningPatchVersion", (n) -> { currentObject.setMinimumWarningPatchVersion(n.getStringValue()); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredPatchVersion() {
        return this._minimumRequiredPatchVersion;
    }
    /**
     * Gets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningPatchVersion() {
        return this._minimumWarningPatchVersion;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
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
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeStringValue("customBrowserDisplayName", this.getCustomBrowserDisplayName());
        writer.writeStringValue("customBrowserPackageId", this.getCustomBrowserPackageId());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("disableAppEncryptionIfDeviceEncryptionIsEnabled", this.getDisableAppEncryptionIfDeviceEncryptionIsEnabled());
        writer.writeBooleanValue("encryptAppData", this.getEncryptAppData());
        writer.writeStringValue("minimumRequiredPatchVersion", this.getMinimumRequiredPatchVersion());
        writer.writeStringValue("minimumWarningPatchVersion", this.getMinimumWarningPatchVersion());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this._apps = value;
    }
    /**
     * Sets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @param value Value to set for the customBrowserDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomBrowserDisplayName(@javax.annotation.Nullable final String value) {
        this._customBrowserDisplayName = value;
    }
    /**
     * Sets the customBrowserPackageId property value. Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @param value Value to set for the customBrowserPackageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomBrowserPackageId(@javax.annotation.Nullable final String value) {
        this._customBrowserPackageId = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployedAppCount(@javax.annotation.Nullable final Integer value) {
        this._deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentSummary(@javax.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this._deploymentSummary = value;
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._disableAppEncryptionIfDeviceEncryptionIsEnabled = value;
    }
    /**
     * Sets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @param value Value to set for the encryptAppData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptAppData(@javax.annotation.Nullable final Boolean value) {
        this._encryptAppData = value;
    }
    /**
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @param value Value to set for the minimumRequiredPatchVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredPatchVersion = value;
    }
    /**
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @param value Value to set for the minimumWarningPatchVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningPatchVersion = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
}
