package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the macOS LOB App.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSLobApp extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link MacOSLobApp} and sets the default values.
     */
    public MacOSLobApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSLobApp}
     */
    @jakarta.annotation.Nonnull
    public static MacOSLobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSLobApp();
    }
    /**
     * Gets the buildNumber property value. The build number of the package. This should match the package CFBundleShortVersionString of the .pkg file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuildNumber() {
        return this.backingStore.get("buildNumber");
    }
    /**
     * Gets the bundleId property value. The primary bundleId of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.backingStore.get("bundleId");
    }
    /**
     * Gets the childApps property value. List of ComplexType macOSLobChildApp objects. Represents the apps expected to be installed by the package.
     * @return a {@link java.util.List<MacOSLobChildApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSLobChildApp> getChildApps() {
        return this.backingStore.get("childApps");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("childApps", (n) -> { this.setChildApps(n.getCollectionOfObjectValues(MacOSLobChildApp::createFromDiscriminatorValue)); });
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("installAsManaged", (n) -> { this.setInstallAsManaged(n.getBooleanValue()); });
        deserializerMap.put("md5Hash", (n) -> { this.setMd5Hash(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("md5HashChunkSize", (n) -> { this.setMd5HashChunkSize(n.getIntegerValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(MacOSMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreVersionDetection property value. When TRUE, indicates that the app&apos;s version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app&apos;s version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.backingStore.get("ignoreVersionDetection");
    }
    /**
     * Gets the installAsManaged property value. When TRUE, indicates that the app will be installed as managed (requires macOS 11.0 and other managed package restrictions). When FALSE, indicates that the app will be installed as unmanaged. The default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallAsManaged() {
        return this.backingStore.get("installAsManaged");
    }
    /**
     * Gets the md5Hash property value. The MD5 hash codes. This is empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMd5Hash() {
        return this.backingStore.get("md5Hash");
    }
    /**
     * Gets the md5HashChunkSize property value. The chunk size for MD5 hash. This is &apos;0&apos; or empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMd5HashChunkSize() {
        return this.backingStore.get("md5HashChunkSize");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @return a {@link MacOSMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public MacOSMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Gets the versionNumber property value. The version number of the package. This should match the package CFBundleVersion in the packageinfo file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersionNumber() {
        return this.backingStore.get("versionNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("buildNumber", this.getBuildNumber());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeCollectionOfObjectValues("childApps", this.getChildApps());
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeBooleanValue("installAsManaged", this.getInstallAsManaged());
        writer.writeCollectionOfPrimitiveValues("md5Hash", this.getMd5Hash());
        writer.writeIntegerValue("md5HashChunkSize", this.getMd5HashChunkSize());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("versionNumber", this.getVersionNumber());
    }
    /**
     * Sets the buildNumber property value. The build number of the package. This should match the package CFBundleShortVersionString of the .pkg file.
     * @param value Value to set for the buildNumber property.
     */
    public void setBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("buildNumber", value);
    }
    /**
     * Sets the bundleId property value. The primary bundleId of the package.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleId", value);
    }
    /**
     * Sets the childApps property value. List of ComplexType macOSLobChildApp objects. Represents the apps expected to be installed by the package.
     * @param value Value to set for the childApps property.
     */
    public void setChildApps(@jakarta.annotation.Nullable final java.util.List<MacOSLobChildApp> value) {
        this.backingStore.set("childApps", value);
    }
    /**
     * Sets the ignoreVersionDetection property value. When TRUE, indicates that the app&apos;s version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app&apos;s version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     * @param value Value to set for the ignoreVersionDetection property.
     */
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ignoreVersionDetection", value);
    }
    /**
     * Sets the installAsManaged property value. When TRUE, indicates that the app will be installed as managed (requires macOS 11.0 and other managed package restrictions). When FALSE, indicates that the app will be installed as unmanaged. The default value is FALSE.
     * @param value Value to set for the installAsManaged property.
     */
    public void setInstallAsManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("installAsManaged", value);
    }
    /**
     * Sets the md5Hash property value. The MD5 hash codes. This is empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @param value Value to set for the md5Hash property.
     */
    public void setMd5Hash(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("md5Hash", value);
    }
    /**
     * Sets the md5HashChunkSize property value. The chunk size for MD5 hash. This is &apos;0&apos; or empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @param value Value to set for the md5HashChunkSize property.
     */
    public void setMd5HashChunkSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("md5HashChunkSize", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final MacOSMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
    /**
     * Sets the versionNumber property value. The version number of the package. This should match the package CFBundleVersion in the packageinfo file.
     * @param value Value to set for the versionNumber property.
     */
    public void setVersionNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionNumber", value);
    }
}
