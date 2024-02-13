package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 Edition Upgrade configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EditionUpgradeConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link EditionUpgradeConfiguration} and sets the default values.
     */
    public EditionUpgradeConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.editionUpgradeConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EditionUpgradeConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static EditionUpgradeConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EditionUpgradeConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("license", (n) -> { this.setLicense(n.getStringValue()); });
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(EditionUpgradeLicenseType::forValue)); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("targetEdition", (n) -> { this.setTargetEdition(n.getEnumValue(Windows10EditionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the license property value. Edition Upgrade License File Content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLicense() {
        return this.backingStore.get("license");
    }
    /**
     * Gets the licenseType property value. Edition Upgrade License type
     * @return a {@link EditionUpgradeLicenseType}
     */
    @jakarta.annotation.Nullable
    public EditionUpgradeLicenseType getLicenseType() {
        return this.backingStore.get("licenseType");
    }
    /**
     * Gets the productKey property value. Edition Upgrade Product Key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductKey() {
        return this.backingStore.get("productKey");
    }
    /**
     * Gets the targetEdition property value. Windows 10 Edition type.
     * @return a {@link Windows10EditionType}
     */
    @jakarta.annotation.Nullable
    public Windows10EditionType getTargetEdition() {
        return this.backingStore.get("targetEdition");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setLicense(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("license", value);
    }
    /**
     * Sets the licenseType property value. Edition Upgrade License type
     * @param value Value to set for the licenseType property.
     */
    public void setLicenseType(@jakarta.annotation.Nullable final EditionUpgradeLicenseType value) {
        this.backingStore.set("licenseType", value);
    }
    /**
     * Sets the productKey property value. Edition Upgrade Product Key.
     * @param value Value to set for the productKey property.
     */
    public void setProductKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productKey", value);
    }
    /**
     * Sets the targetEdition property value. Windows 10 Edition type.
     * @param value Value to set for the targetEdition property.
     */
    public void setTargetEdition(@jakarta.annotation.Nullable final Windows10EditionType value) {
        this.backingStore.set("targetEdition", value);
    }
}
