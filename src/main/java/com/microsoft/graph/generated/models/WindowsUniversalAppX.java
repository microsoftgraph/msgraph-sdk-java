package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Universal AppX Line Of Business apps. Inherits from `mobileLobApp`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsUniversalAppX extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link WindowsUniversalAppX} and sets the default values.
     */
    public WindowsUniversalAppX() {
        super();
        this.setOdataType("#microsoft.graph.windowsUniversalAppX");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsUniversalAppX}
     */
    @jakarta.annotation.Nonnull
    public static WindowsUniversalAppX createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUniversalAppX();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a {@link EnumSet<WindowsArchitecture>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getApplicableArchitectures() {
        return this.backingStore.get("applicableArchitectures");
    }
    /**
     * Gets the applicableDeviceTypes property value. Contains properties for Windows device type. Multiple values can be selected. Default value is `none`.
     * @return a {@link EnumSet<WindowsDeviceType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsDeviceType> getApplicableDeviceTypes() {
        return this.backingStore.get("applicableDeviceTypes");
    }
    /**
     * Gets the committedContainedApps property value. The collection of contained apps in the committed mobileAppContent of a windowsUniversalAppX app.
     * @return a {@link java.util.List<MobileContainedApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileContainedApp> getCommittedContainedApps() {
        return this.backingStore.get("committedContainedApps");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumSetValue(WindowsArchitecture::forValue)); });
        deserializerMap.put("applicableDeviceTypes", (n) -> { this.setApplicableDeviceTypes(n.getEnumSetValue(WindowsDeviceType::forValue)); });
        deserializerMap.put("committedContainedApps", (n) -> { this.setCommittedContainedApps(n.getCollectionOfObjectValues(MobileContainedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("identityName", (n) -> { this.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityPublisherHash", (n) -> { this.setIdentityPublisherHash(n.getStringValue()); });
        deserializerMap.put("identityResourceIdentifier", (n) -> { this.setIdentityResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("isBundle", (n) -> { this.setIsBundle(n.getBooleanValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityName property value. The Identity Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityName() {
        return this.backingStore.get("identityName");
    }
    /**
     * Gets the identityPublisherHash property value. The Identity Publisher Hash.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this.backingStore.get("identityPublisherHash");
    }
    /**
     * Gets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this.backingStore.get("identityResourceIdentifier");
    }
    /**
     * Gets the identityVersion property value. The identity version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.backingStore.get("identityVersion");
    }
    /**
     * Gets the isBundle property value. Whether or not the app is a bundle.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBundle() {
        return this.backingStore.get("isBundle");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a {@link WindowsMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeEnumSetValue("applicableDeviceTypes", this.getApplicableDeviceTypes());
        writer.writeCollectionOfObjectValues("committedContainedApps", this.getCommittedContainedApps());
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityPublisherHash", this.getIdentityPublisherHash());
        writer.writeStringValue("identityResourceIdentifier", this.getIdentityResourceIdentifier());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeBooleanValue("isBundle", this.getIsBundle());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     */
    public void setApplicableArchitectures(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("applicableArchitectures", value);
    }
    /**
     * Sets the applicableDeviceTypes property value. Contains properties for Windows device type. Multiple values can be selected. Default value is `none`.
     * @param value Value to set for the applicableDeviceTypes property.
     */
    public void setApplicableDeviceTypes(@jakarta.annotation.Nullable final EnumSet<WindowsDeviceType> value) {
        this.backingStore.set("applicableDeviceTypes", value);
    }
    /**
     * Sets the committedContainedApps property value. The collection of contained apps in the committed mobileAppContent of a windowsUniversalAppX app.
     * @param value Value to set for the committedContainedApps property.
     */
    public void setCommittedContainedApps(@jakarta.annotation.Nullable final java.util.List<MobileContainedApp> value) {
        this.backingStore.set("committedContainedApps", value);
    }
    /**
     * Sets the identityName property value. The Identity Name.
     * @param value Value to set for the identityName property.
     */
    public void setIdentityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityName", value);
    }
    /**
     * Sets the identityPublisherHash property value. The Identity Publisher Hash.
     * @param value Value to set for the identityPublisherHash property.
     */
    public void setIdentityPublisherHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityPublisherHash", value);
    }
    /**
     * Sets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @param value Value to set for the identityResourceIdentifier property.
     */
    public void setIdentityResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityResourceIdentifier", value);
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityVersion", value);
    }
    /**
     * Sets the isBundle property value. Whether or not the app is a bundle.
     * @param value Value to set for the isBundle property.
     */
    public void setIsBundle(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBundle", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
}
