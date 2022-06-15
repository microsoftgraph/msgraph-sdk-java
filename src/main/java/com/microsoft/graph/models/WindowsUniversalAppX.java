package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUniversalAppX extends MobileLobApp implements Parsable {
    /** The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral, arm64. */
    private WindowsArchitecture _applicableArchitectures;
    /** The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic, team. */
    private WindowsDeviceType _applicableDeviceTypes;
    /** The Identity Name. */
    private String _identityName;
    /** The Identity Publisher Hash. */
    private String _identityPublisherHash;
    /** The Identity Resource Identifier. */
    private String _identityResourceIdentifier;
    /** The identity version. */
    private String _identityVersion;
    /** Whether or not the app is a bundle. */
    private Boolean _isBundle;
    /** The minimum operating system required for a Windows mobile app. */
    private WindowsMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /**
     * Instantiates a new WindowsUniversalAppX and sets the default values.
     * @return a void
     */
    public WindowsUniversalAppX() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUniversalAppX
     */
    @javax.annotation.Nonnull
    public static WindowsUniversalAppX createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUniversalAppX();
    }
    /**
     * Gets the applicableArchitectures property value. The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral, arm64.
     * @return a windowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitectures() {
        return this._applicableArchitectures;
    }
    /**
     * Gets the applicableDeviceTypes property value. The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic, team.
     * @return a windowsDeviceType
     */
    @javax.annotation.Nullable
    public WindowsDeviceType getApplicableDeviceTypes() {
        return this._applicableDeviceTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsUniversalAppX currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicableArchitectures", (n) -> { currentObject.setApplicableArchitectures(n.getEnumValue(WindowsArchitecture.class)); });
            this.put("applicableDeviceTypes", (n) -> { currentObject.setApplicableDeviceTypes(n.getEnumValue(WindowsDeviceType.class)); });
            this.put("identityName", (n) -> { currentObject.setIdentityName(n.getStringValue()); });
            this.put("identityPublisherHash", (n) -> { currentObject.setIdentityPublisherHash(n.getStringValue()); });
            this.put("identityResourceIdentifier", (n) -> { currentObject.setIdentityResourceIdentifier(n.getStringValue()); });
            this.put("identityVersion", (n) -> { currentObject.setIdentityVersion(n.getStringValue()); });
            this.put("isBundle", (n) -> { currentObject.setIsBundle(n.getBooleanValue()); });
            this.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the identityName property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityName() {
        return this._identityName;
    }
    /**
     * Gets the identityPublisherHash property value. The Identity Publisher Hash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this._identityPublisherHash;
    }
    /**
     * Gets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this._identityResourceIdentifier;
    }
    /**
     * Gets the identityVersion property value. The identity version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this._identityVersion;
    }
    /**
     * Gets the isBundle property value. Whether or not the app is a bundle.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBundle() {
        return this._isBundle;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a windowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeEnumValue("applicableDeviceTypes", this.getApplicableDeviceTypes());
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityPublisherHash", this.getIdentityPublisherHash());
        writer.writeStringValue("identityResourceIdentifier", this.getIdentityResourceIdentifier());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeBooleanValue("isBundle", this.getIsBundle());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
    }
    /**
     * Sets the applicableArchitectures property value. The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral, arm64.
     * @param value Value to set for the applicableArchitectures property.
     * @return a void
     */
    public void setApplicableArchitectures(@javax.annotation.Nullable final WindowsArchitecture value) {
        this._applicableArchitectures = value;
    }
    /**
     * Sets the applicableDeviceTypes property value. The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic, team.
     * @param value Value to set for the applicableDeviceTypes property.
     * @return a void
     */
    public void setApplicableDeviceTypes(@javax.annotation.Nullable final WindowsDeviceType value) {
        this._applicableDeviceTypes = value;
    }
    /**
     * Sets the identityName property value. The Identity Name.
     * @param value Value to set for the identityName property.
     * @return a void
     */
    public void setIdentityName(@javax.annotation.Nullable final String value) {
        this._identityName = value;
    }
    /**
     * Sets the identityPublisherHash property value. The Identity Publisher Hash.
     * @param value Value to set for the identityPublisherHash property.
     * @return a void
     */
    public void setIdentityPublisherHash(@javax.annotation.Nullable final String value) {
        this._identityPublisherHash = value;
    }
    /**
     * Sets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @param value Value to set for the identityResourceIdentifier property.
     * @return a void
     */
    public void setIdentityResourceIdentifier(@javax.annotation.Nullable final String value) {
        this._identityResourceIdentifier = value;
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this._identityVersion = value;
    }
    /**
     * Sets the isBundle property value. Whether or not the app is a bundle.
     * @param value Value to set for the isBundle property.
     * @return a void
     */
    public void setIsBundle(@javax.annotation.Nullable final Boolean value) {
        this._isBundle = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
}
