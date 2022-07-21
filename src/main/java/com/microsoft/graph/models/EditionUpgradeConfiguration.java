package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EditionUpgradeConfiguration extends DeviceConfiguration implements Parsable {
    /** Edition Upgrade License File Content. */
    private String _license;
    /** Edition Upgrade License type */
    private EditionUpgradeLicenseType _licenseType;
    /** Edition Upgrade Product Key. */
    private String _productKey;
    /** Windows 10 Edition type. */
    private Windows10EditionType _targetEdition;
    /**
     * Instantiates a new EditionUpgradeConfiguration and sets the default values.
     * @return a void
     */
    public EditionUpgradeConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.editionUpgradeConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EditionUpgradeConfiguration
     */
    @javax.annotation.Nonnull
    public static EditionUpgradeConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EditionUpgradeConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EditionUpgradeConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("license", (n) -> { currentObject.setLicense(n.getStringValue()); });
            this.put("licenseType", (n) -> { currentObject.setLicenseType(n.getEnumValue(EditionUpgradeLicenseType.class)); });
            this.put("productKey", (n) -> { currentObject.setProductKey(n.getStringValue()); });
            this.put("targetEdition", (n) -> { currentObject.setTargetEdition(n.getEnumValue(Windows10EditionType.class)); });
        }};
    }
    /**
     * Gets the license property value. Edition Upgrade License File Content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLicense() {
        return this._license;
    }
    /**
     * Gets the licenseType property value. Edition Upgrade License type
     * @return a editionUpgradeLicenseType
     */
    @javax.annotation.Nullable
    public EditionUpgradeLicenseType getLicenseType() {
        return this._licenseType;
    }
    /**
     * Gets the productKey property value. Edition Upgrade Product Key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this._productKey;
    }
    /**
     * Gets the targetEdition property value. Windows 10 Edition type.
     * @return a windows10EditionType
     */
    @javax.annotation.Nullable
    public Windows10EditionType getTargetEdition() {
        return this._targetEdition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("license", this.getLicense());
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeEnumValue("targetEdition", this.getTargetEdition());
    }
    /**
     * Sets the license property value. Edition Upgrade License File Content.
     * @param value Value to set for the license property.
     * @return a void
     */
    public void setLicense(@javax.annotation.Nullable final String value) {
        this._license = value;
    }
    /**
     * Sets the licenseType property value. Edition Upgrade License type
     * @param value Value to set for the licenseType property.
     * @return a void
     */
    public void setLicenseType(@javax.annotation.Nullable final EditionUpgradeLicenseType value) {
        this._licenseType = value;
    }
    /**
     * Sets the productKey property value. Edition Upgrade Product Key.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this._productKey = value;
    }
    /**
     * Sets the targetEdition property value. Windows 10 Edition type.
     * @param value Value to set for the targetEdition property.
     * @return a void
     */
    public void setTargetEdition(@javax.annotation.Nullable final Windows10EditionType value) {
        this._targetEdition = value;
    }
}
