package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for iOS Line Of Business apps.
 */
public class IosLobApp extends MobileLobApp implements Parsable {
    /**
     * Contains properties of the possible iOS device types the mobile app can run on.
     */
    private IosDeviceType applicableDeviceType;
    /**
     * The build number of iOS Line of Business (LoB) app.
     */
    private String buildNumber;
    /**
     * The Identity Name.
     */
    private String bundleId;
    /**
     * The expiration time.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The value for the minimum applicable operating system.
     */
    private IosMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The version number of iOS Line of Business (LoB) app.
     */
    private String versionNumber;
    /**
     * Instantiates a new iosLobApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosLobApp() {
        super();
        this.setOdataType("#microsoft.graph.iosLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosLobApp
     */
    @javax.annotation.Nonnull
    public static IosLobApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobApp();
    }
    /**
     * Gets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @return a iosDeviceType
     */
    @javax.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this.applicableDeviceType;
    }
    /**
     * Gets the buildNumber property value. The build number of iOS Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuildNumber() {
        return this.buildNumber;
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * Gets the expirationDateTime property value. The expiration time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableDeviceType", (n) -> { this.setApplicableDeviceType(n.getObjectValue(IosDeviceType::createFromDiscriminatorValue)); });
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(IosMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a iosMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public IosMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the versionNumber property value. The version number of iOS Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionNumber() {
        return this.versionNumber;
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
        writer.writeObjectValue("applicableDeviceType", this.getApplicableDeviceType());
        writer.writeStringValue("buildNumber", this.getBuildNumber());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("versionNumber", this.getVersionNumber());
    }
    /**
     * Sets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @param value Value to set for the applicableDeviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableDeviceType(@javax.annotation.Nullable final IosDeviceType value) {
        this.applicableDeviceType = value;
    }
    /**
     * Sets the buildNumber property value. The build number of iOS Line of Business (LoB) app.
     * @param value Value to set for the buildNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuildNumber(@javax.annotation.Nullable final String value) {
        this.buildNumber = value;
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this.bundleId = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration time.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final IosMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the versionNumber property value. The version number of iOS Line of Business (LoB) app.
     * @param value Value to set for the versionNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionNumber(@javax.annotation.Nullable final String value) {
        this.versionNumber = value;
    }
}
