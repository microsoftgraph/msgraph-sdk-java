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
     * Contains properties for Windows architecture.
     */
    private EnumSet<WindowsArchitecture> applicableArchitectures;
    /**
     * Contains properties for Windows device type. Multiple values can be selected. Default value is `none`.
     */
    private EnumSet<WindowsDeviceType> applicableDeviceTypes;
    /**
     * The collection of contained apps in the committed mobileAppContent of a windowsUniversalAppX app.
     */
    private java.util.List<MobileContainedApp> committedContainedApps;
    /**
     * The Identity Name.
     */
    private String identityName;
    /**
     * The Identity Publisher Hash.
     */
    private String identityPublisherHash;
    /**
     * The Identity Resource Identifier.
     */
    private String identityResourceIdentifier;
    /**
     * The identity version.
     */
    private String identityVersion;
    /**
     * Whether or not the app is a bundle.
     */
    private Boolean isBundle;
    /**
     * The minimum operating system required for a Windows mobile app.
     */
    private WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * Instantiates a new windowsUniversalAppX and sets the default values.
     */
    public WindowsUniversalAppX() {
        super();
        this.setOdataType("#microsoft.graph.windowsUniversalAppX");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsUniversalAppX
     */
    @jakarta.annotation.Nonnull
    public static WindowsUniversalAppX createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUniversalAppX();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a windowsArchitecture
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getApplicableArchitectures() {
        return this.applicableArchitectures;
    }
    /**
     * Gets the applicableDeviceTypes property value. Contains properties for Windows device type. Multiple values can be selected. Default value is `none`.
     * @return a windowsDeviceType
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsDeviceType> getApplicableDeviceTypes() {
        return this.applicableDeviceTypes;
    }
    /**
     * Gets the committedContainedApps property value. The collection of contained apps in the committed mobileAppContent of a windowsUniversalAppX app.
     * @return a mobileContainedApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileContainedApp> getCommittedContainedApps() {
        return this.committedContainedApps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumSetValue(WindowsArchitecture.class)); });
        deserializerMap.put("applicableDeviceTypes", (n) -> { this.setApplicableDeviceTypes(n.getEnumSetValue(WindowsDeviceType.class)); });
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdentityName() {
        return this.identityName;
    }
    /**
     * Gets the identityPublisherHash property value. The Identity Publisher Hash.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this.identityPublisherHash;
    }
    /**
     * Gets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this.identityResourceIdentifier;
    }
    /**
     * Gets the identityVersion property value. The identity version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.identityVersion;
    }
    /**
     * Gets the isBundle property value. Whether or not the app is a bundle.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBundle() {
        return this.isBundle;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a windowsMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
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
        this.applicableArchitectures = value;
    }
    /**
     * Sets the applicableDeviceTypes property value. Contains properties for Windows device type. Multiple values can be selected. Default value is `none`.
     * @param value Value to set for the applicableDeviceTypes property.
     */
    public void setApplicableDeviceTypes(@jakarta.annotation.Nullable final EnumSet<WindowsDeviceType> value) {
        this.applicableDeviceTypes = value;
    }
    /**
     * Sets the committedContainedApps property value. The collection of contained apps in the committed mobileAppContent of a windowsUniversalAppX app.
     * @param value Value to set for the committedContainedApps property.
     */
    public void setCommittedContainedApps(@jakarta.annotation.Nullable final java.util.List<MobileContainedApp> value) {
        this.committedContainedApps = value;
    }
    /**
     * Sets the identityName property value. The Identity Name.
     * @param value Value to set for the identityName property.
     */
    public void setIdentityName(@jakarta.annotation.Nullable final String value) {
        this.identityName = value;
    }
    /**
     * Sets the identityPublisherHash property value. The Identity Publisher Hash.
     * @param value Value to set for the identityPublisherHash property.
     */
    public void setIdentityPublisherHash(@jakarta.annotation.Nullable final String value) {
        this.identityPublisherHash = value;
    }
    /**
     * Sets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @param value Value to set for the identityResourceIdentifier property.
     */
    public void setIdentityResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.identityResourceIdentifier = value;
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the isBundle property value. Whether or not the app is a bundle.
     * @param value Value to set for the isBundle property.
     */
    public void setIsBundle(@jakarta.annotation.Nullable final Boolean value) {
        this.isBundle = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
}
