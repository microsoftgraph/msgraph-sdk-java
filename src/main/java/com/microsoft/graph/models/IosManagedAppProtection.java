package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings targeted to specific security groups and for a specified set of apps on an iOS device
 */
public class IosManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /**
     * Represents the level to which app data is encrypted for managed apps
     */
    private ManagedAppDataEncryptionType appDataEncryptionType;
    /**
     * List of apps to which the policy is deployed.
     */
    private java.util.List<ManagedMobileApp> apps;
    /**
     * A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     */
    private String customBrowserProtocol;
    /**
     * Count of apps to which the current policy is deployed.
     */
    private Integer deployedAppCount;
    /**
     * Navigation property to deployment summary of the configuration.
     */
    private ManagedAppPolicyDeploymentSummary deploymentSummary;
    /**
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     */
    private Boolean faceIdBlocked;
    /**
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    private String minimumRequiredSdkVersion;
    /**
     * Instantiates a new iosManagedAppProtection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IosManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.iosManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosManagedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static IosManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosManagedAppProtection();
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
     * Gets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserProtocol() {
        return this.customBrowserProtocol;
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
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
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
        deserializerMap.put("customBrowserProtocol", (n) -> { this.setCustomBrowserProtocol(n.getStringValue()); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deploymentSummary", (n) -> { this.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("faceIdBlocked", (n) -> { this.setFaceIdBlocked(n.getBooleanValue()); });
        deserializerMap.put("minimumRequiredSdkVersion", (n) -> { this.setMinimumRequiredSdkVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this.minimumRequiredSdkVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("appDataEncryptionType", this.getAppDataEncryptionType());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeStringValue("customBrowserProtocol", this.getCustomBrowserProtocol());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("faceIdBlocked", this.getFaceIdBlocked());
        writer.writeStringValue("minimumRequiredSdkVersion", this.getMinimumRequiredSdkVersion());
    }
    /**
     * Sets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @param value Value to set for the appDataEncryptionType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppDataEncryptionType(@jakarta.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this.appDataEncryptionType = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.apps = value;
    }
    /**
     * Sets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @param value Value to set for the customBrowserProtocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomBrowserProtocol(@jakarta.annotation.Nullable final String value) {
        this.customBrowserProtocol = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeployedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeploymentSummary(@jakarta.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this.deploymentSummary = value;
    }
    /**
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the faceIdBlocked property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFaceIdBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.faceIdBlocked = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumRequiredSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumRequiredSdkVersion = value;
    }
}
