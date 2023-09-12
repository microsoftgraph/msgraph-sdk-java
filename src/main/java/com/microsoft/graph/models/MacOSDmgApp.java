package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the MacOS DMG (Apple Disk Image) App.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSDmgApp extends MobileLobApp implements Parsable {
    /**
     * When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     */
    private Boolean ignoreVersionDetection;
    /**
     * The list of .apps expected to be installed by the DMG (Apple Disk Image)
     */
    private java.util.List<MacOSIncludedApp> includedApps;
    /**
     * ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     */
    private MacOSMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The bundleId of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleIdentifier in the app's bundle configuration.
     */
    private String primaryBundleId;
    /**
     * The version of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleShortVersion in the app's bundle configuration.
     */
    private String primaryBundleVersion;
    /**
     * Instantiates a new macOSDmgApp and sets the default values.
     */
    public MacOSDmgApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSDmgApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSDmgApp
     */
    @jakarta.annotation.Nonnull
    public static MacOSDmgApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSDmgApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("includedApps", (n) -> { this.setIncludedApps(n.getCollectionOfObjectValues(MacOSIncludedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(MacOSMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("primaryBundleId", (n) -> { this.setPrimaryBundleId(n.getStringValue()); });
        deserializerMap.put("primaryBundleVersion", (n) -> { this.setPrimaryBundleVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreVersionDetection property value. When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.ignoreVersionDetection;
    }
    /**
     * Gets the includedApps property value. The list of .apps expected to be installed by the DMG (Apple Disk Image)
     * @return a macOSIncludedApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSIncludedApp> getIncludedApps() {
        return this.includedApps;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @return a macOSMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public MacOSMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the primaryBundleId property value. The bundleId of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleIdentifier in the app's bundle configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBundleId() {
        return this.primaryBundleId;
    }
    /**
     * Gets the primaryBundleVersion property value. The version of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleShortVersion in the app's bundle configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBundleVersion() {
        return this.primaryBundleVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeCollectionOfObjectValues("includedApps", this.getIncludedApps());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("primaryBundleId", this.getPrimaryBundleId());
        writer.writeStringValue("primaryBundleVersion", this.getPrimaryBundleVersion());
    }
    /**
     * Sets the ignoreVersionDetection property value. When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     * @param value Value to set for the ignoreVersionDetection property.
     */
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreVersionDetection = value;
    }
    /**
     * Sets the includedApps property value. The list of .apps expected to be installed by the DMG (Apple Disk Image)
     * @param value Value to set for the includedApps property.
     */
    public void setIncludedApps(@jakarta.annotation.Nullable final java.util.List<MacOSIncludedApp> value) {
        this.includedApps = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final MacOSMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the primaryBundleId property value. The bundleId of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleIdentifier in the app's bundle configuration.
     * @param value Value to set for the primaryBundleId property.
     */
    public void setPrimaryBundleId(@jakarta.annotation.Nullable final String value) {
        this.primaryBundleId = value;
    }
    /**
     * Sets the primaryBundleVersion property value. The version of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleShortVersion in the app's bundle configuration.
     * @param value Value to set for the primaryBundleVersion property.
     */
    public void setPrimaryBundleVersion(@jakarta.annotation.Nullable final String value) {
        this.primaryBundleVersion = value;
    }
}
