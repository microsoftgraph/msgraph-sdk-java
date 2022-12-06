package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /** Represents the level to which app data is encrypted for managed apps */
    private ManagedAppDataEncryptionType _appDataEncryptionType;
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> _apps;
    /** A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. */
    private String _customBrowserProtocol;
    /** Count of apps to which the current policy is deployed. */
    private Integer _deployedAppCount;
    /** Navigation property to deployment summary of the configuration. */
    private ManagedAppPolicyDeploymentSummary _deploymentSummary;
    /** Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. */
    private Boolean _faceIdBlocked;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumRequiredSdkVersion;
    /**
     * Instantiates a new IosManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.iosManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static IosManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosManagedAppProtection();
    }
    /**
     * Gets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @return a managedAppDataEncryptionType
     */
    @javax.annotation.Nullable
    public ManagedAppDataEncryptionType getAppDataEncryptionType() {
        return this._appDataEncryptionType;
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
     * Gets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserProtocol() {
        return this._customBrowserProtocol;
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
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFaceIdBlocked() {
        return this._faceIdBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @javax.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this._minimumRequiredSdkVersion;
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
    @javax.annotation.Nonnull
    public void setAppDataEncryptionType(@javax.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this._appDataEncryptionType = value;
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
     * Sets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     * @param value Value to set for the customBrowserProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomBrowserProtocol(@javax.annotation.Nullable final String value) {
        this._customBrowserProtocol = value;
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
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the faceIdBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFaceIdBlocked(@javax.annotation.Nullable final Boolean value) {
        this._faceIdBlocked = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredSdkVersion = value;
    }
}
