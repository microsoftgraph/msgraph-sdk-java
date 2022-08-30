package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedIOSLobApp extends ManagedMobileLobApp implements Parsable {
    /** Contains properties of the possible iOS device types the mobile app can run on. */
    private IosDeviceType _applicableDeviceType;
    /** The build number of managed iOS Line of Business (LoB) app. */
    private String _buildNumber;
    /** The Identity Name. */
    private String _bundleId;
    /** The expiration time. */
    private OffsetDateTime _expirationDateTime;
    /** The value for the minimum applicable operating system. */
    private IosMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The version number of managed iOS Line of Business (LoB) app. */
    private String _versionNumber;
    /**
     * Instantiates a new ManagedIOSLobApp and sets the default values.
     * @return a void
     */
    public ManagedIOSLobApp() {
        super();
        this.setOdataType("#microsoft.graph.managedIOSLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedIOSLobApp
     */
    @javax.annotation.Nonnull
    public static ManagedIOSLobApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedIOSLobApp();
    }
    /**
     * Gets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @return a iosDeviceType
     */
    @javax.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this._applicableDeviceType;
    }
    /**
     * Gets the buildNumber property value. The build number of managed iOS Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuildNumber() {
        return this._buildNumber;
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * Gets the expirationDateTime property value. The expiration time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedIOSLobApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicableDeviceType", (n) -> { currentObject.setApplicableDeviceType(n.getObjectValue(IosDeviceType::createFromDiscriminatorValue)); });
            this.put("buildNumber", (n) -> { currentObject.setBuildNumber(n.getStringValue()); });
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(IosMinimumOperatingSystem::createFromDiscriminatorValue)); });
            this.put("versionNumber", (n) -> { currentObject.setVersionNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a iosMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public IosMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the versionNumber property value. The version number of managed iOS Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionNumber() {
        return this._versionNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setApplicableDeviceType(@javax.annotation.Nullable final IosDeviceType value) {
        this._applicableDeviceType = value;
    }
    /**
     * Sets the buildNumber property value. The build number of managed iOS Line of Business (LoB) app.
     * @param value Value to set for the buildNumber property.
     * @return a void
     */
    public void setBuildNumber(@javax.annotation.Nullable final String value) {
        this._buildNumber = value;
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration time.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final IosMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the versionNumber property value. The version number of managed iOS Line of Business (LoB) app.
     * @param value Value to set for the versionNumber property.
     * @return a void
     */
    public void setVersionNumber(@javax.annotation.Nullable final String value) {
        this._versionNumber = value;
    }
}
