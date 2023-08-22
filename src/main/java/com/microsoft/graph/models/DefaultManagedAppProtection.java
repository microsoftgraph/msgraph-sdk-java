package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings for a specified set of apps for all users not targeted by a TargetedManagedAppProtection Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DefaultManagedAppProtection extends ManagedAppProtection implements Parsable {
    /**
     * Represents the level to which app data is encrypted for managed apps
     */
    private ManagedAppDataEncryptionType appDataEncryptionType;
    /**
     * List of apps to which the policy is deployed.
     */
    private java.util.List<ManagedMobileApp> apps;
    /**
     * A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     */
    private java.util.List<KeyValuePair> customSettings;
    /**
     * Count of apps to which the current policy is deployed.
     */
    private Integer deployedAppCount;
    /**
     * Navigation property to deployment summary of the configuration.
     */
    private ManagedAppPolicyDeploymentSummary deploymentSummary;
    /**
     * When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     */
    private Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;
    /**
     * Indicates whether managed-app data should be encrypted. (Android only)
     */
    private Boolean encryptAppData;
    /**
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     */
    private Boolean faceIdBlocked;
    /**
     * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     */
    private String minimumRequiredPatchVersion;
    /**
     * Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     */
    private String minimumRequiredSdkVersion;
    /**
     * Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     */
    private String minimumWarningPatchVersion;
    /**
     * Indicates whether screen capture is blocked. (Android only)
     */
    private Boolean screenCaptureBlocked;
    /**
     * Instantiates a new defaultManagedAppProtection and sets the default values.
     */
    public DefaultManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.defaultManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a defaultManagedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static DefaultManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultManagedAppProtection();
    }
    /**
     * Gets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @return a managedAppDataEncryptionType
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataEncryptionType getAppDataEncryptionType() {
        return this.appDataEncryptionType;
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a managedMobileApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this.apps;
    }
    /**
     * Gets the customSettings property value. A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     * @return a keyValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomSettings() {
        return this.customSettings;
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this.deployedAppCount;
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a managedAppPolicyDeploymentSummary
     */
    @jakarta.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this.deploymentSummary;
    }
    /**
     * Gets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAppEncryptionIfDeviceEncryptionIsEnabled() {
        return this.disableAppEncryptionIfDeviceEncryptionIsEnabled;
    }
    /**
     * Gets the encryptAppData property value. Indicates whether managed-app data should be encrypted. (Android only)
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEncryptAppData() {
        return this.encryptAppData;
    }
    /**
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFaceIdBlocked() {
        return this.faceIdBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDataEncryptionType", (n) -> { this.setAppDataEncryptionType(n.getEnumValue(ManagedAppDataEncryptionType.class)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("customSettings", (n) -> { this.setCustomSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deploymentSummary", (n) -> { this.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("disableAppEncryptionIfDeviceEncryptionIsEnabled", (n) -> { this.setDisableAppEncryptionIfDeviceEncryptionIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("encryptAppData", (n) -> { this.setEncryptAppData(n.getBooleanValue()); });
        deserializerMap.put("faceIdBlocked", (n) -> { this.setFaceIdBlocked(n.getBooleanValue()); });
        deserializerMap.put("minimumRequiredPatchVersion", (n) -> { this.setMinimumRequiredPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredSdkVersion", (n) -> { this.setMinimumRequiredSdkVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningPatchVersion", (n) -> { this.setMinimumWarningPatchVersion(n.getStringValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredPatchVersion() {
        return this.minimumRequiredPatchVersion;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this.minimumRequiredSdkVersion;
    }
    /**
     * Gets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningPatchVersion() {
        return this.minimumWarningPatchVersion;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether screen capture is blocked. (Android only)
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("appDataEncryptionType", this.getAppDataEncryptionType());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeCollectionOfObjectValues("customSettings", this.getCustomSettings());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("disableAppEncryptionIfDeviceEncryptionIsEnabled", this.getDisableAppEncryptionIfDeviceEncryptionIsEnabled());
        writer.writeBooleanValue("encryptAppData", this.getEncryptAppData());
        writer.writeBooleanValue("faceIdBlocked", this.getFaceIdBlocked());
        writer.writeStringValue("minimumRequiredPatchVersion", this.getMinimumRequiredPatchVersion());
        writer.writeStringValue("minimumRequiredSdkVersion", this.getMinimumRequiredSdkVersion());
        writer.writeStringValue("minimumWarningPatchVersion", this.getMinimumWarningPatchVersion());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
    }
    /**
     * Sets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @param value Value to set for the appDataEncryptionType property.
     */
    public void setAppDataEncryptionType(@jakarta.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this.appDataEncryptionType = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.apps = value;
    }
    /**
     * Sets the customSettings property value. A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     * @param value Value to set for the customSettings property.
     */
    public void setCustomSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.customSettings = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     */
    public void setDeployedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     */
    public void setDeploymentSummary(@jakarta.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this.deploymentSummary = value;
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     */
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.disableAppEncryptionIfDeviceEncryptionIsEnabled = value;
    }
    /**
     * Sets the encryptAppData property value. Indicates whether managed-app data should be encrypted. (Android only)
     * @param value Value to set for the encryptAppData property.
     */
    public void setEncryptAppData(@jakarta.annotation.Nullable final Boolean value) {
        this.encryptAppData = value;
    }
    /**
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     * @param value Value to set for the faceIdBlocked property.
     */
    public void setFaceIdBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.faceIdBlocked = value;
    }
    /**
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     * @param value Value to set for the minimumRequiredPatchVersion property.
     */
    public void setMinimumRequiredPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumRequiredPatchVersion = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     * @param value Value to set for the minimumRequiredSdkVersion property.
     */
    public void setMinimumRequiredSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumRequiredSdkVersion = value;
    }
    /**
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     * @param value Value to set for the minimumWarningPatchVersion property.
     */
    public void setMinimumWarningPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWarningPatchVersion = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether screen capture is blocked. (Android only)
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
}
